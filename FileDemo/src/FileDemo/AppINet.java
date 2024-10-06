package FileDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class AppINet {
	public static void main(String[] args) throws IOException {
		// Tạo chuỗi định vị tài nguyên mạng đến trang default.aspx
		URL url = new URL("https://ntu.edu.vn/default.aspx");
		// Gửi yêu cầu kết nối
		// Giống như chúng ta nhập url vào trình duyệt rồi nhấn enter
		URLConnection urlCon = url.openConnection();
		// Server trả về kết quả, thông qua luồng
		// ta dùng luông InputStream để đón nhận kết quả
		InputStream is = urlCon.getInputStream();
		// Xử lý luồng, đọc dữ liệu, phần này độc lập
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
		
	}
}
