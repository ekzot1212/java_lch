package day24.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpEx {

	public static void main(String[] args) {
		
		InetAddress inetAddress = null;
		
		try {
			//이름이 localhost인 곳의 IP 주소 정보를 가져옴. 모든 pc가 같음
			inetAddress = InetAddress.getByName("localhost");	//내 pc를 서버로 이용하여 네트워크를 형성할때 씀 = localhost
			System.out.println(inetAddress);
			// 네이버 사이트의 아이피 주소 조회
			inetAddress = InetAddress.getByName("www.naver.com");
			System.out.println(inetAddress);
			// 내 PC의 아이피 조회
			inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress);
			
			System.out.println("==============================");
			InetAddress [] address = 
					InetAddress.getAllByName("www.naver.com");	//전부를 가져옴
			for(InetAddress tmp : address) {
				System.out.println(tmp);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

