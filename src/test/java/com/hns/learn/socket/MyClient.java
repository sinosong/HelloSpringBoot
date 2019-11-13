package com.hns.learn.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
 
public class MyClient {
 
//	private final static Logger logger = Logger.getLogger(MyClient.class.getName());
	
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			final int idx = i;
			new Thread(new MyRunnable(idx)).start();
		}
	}
	
	private static final class MyRunnable implements Runnable {
		
		private final int idx;
 
		private MyRunnable(int idx) {
			this.idx = idx;
		}
 
		public void run() {
			SocketChannel socketChannel = null;
			try {
				socketChannel = SocketChannel.open();
				SocketAddress socketAddress = new InetSocketAddress("localhost", 10000);
				boolean isConn = socketChannel.connect(socketAddress);
//				System.out.println(isConn + " idx="+idx);

				MyRequestObject myRequestObject = new MyRequestObject("request_" + idx, "request_" + idx);
//				logger.log(Level.INFO, myRequestObject.toString());
				System.out.println(myRequestObject.toString());
				sendData(socketChannel, myRequestObject);
				MyResponseObject myResponseObject = receiveData(socketChannel);
				System.out.println(myResponseObject.toString());
			} catch (Exception ex) {
//				System.out.println(ex.getMessage());
				System.out.println(" err="+idx);
				ex.printStackTrace();
			} finally {
				try {
					socketChannel.close();
				} catch(Exception ex) {
//					System.out.println(ex.getMessage());
					ex.printStackTrace();
				}
			}
		}
 
		private void sendData(SocketChannel socketChannel, MyRequestObject myRequestObject) throws IOException {
			byte[] bytes = SerializableUtil.toBytes(myRequestObject);
			ByteBuffer buffer = ByteBuffer.wrap(bytes);
//			System.out.println("isConnected___"+socketChannel.isConnected());
			socketChannel.write(buffer);
			socketChannel.socket().shutdownOutput();
		}
 
		private MyResponseObject receiveData(SocketChannel socketChannel) throws IOException {
			MyResponseObject myResponseObject = null;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			try {
				ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
				byte[] bytes;
				int count = 0;
				while ((count = socketChannel.read(buffer)) >= 0) {
					buffer.flip();
					bytes = new byte[count];
					buffer.get(bytes);
					baos.write(bytes);
					buffer.clear();
				}
				bytes = baos.toByteArray();
				Object obj = SerializableUtil.toObject(bytes);
				myResponseObject = (MyResponseObject) obj;
				socketChannel.socket().shutdownInput();
			} finally {
				try {
					baos.close();
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			return myResponseObject;
		}
	}
}
