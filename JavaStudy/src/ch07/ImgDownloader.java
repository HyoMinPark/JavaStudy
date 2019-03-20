package ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImgDownloader {
	public static void main(String[] args) {
		File outputFile = new File("D:/dev/test.jpg");
		 
		URL url = null;
		BufferedImage bi = null;
		        
		try {
		    url = new URL("http://blogfiles.naver.net/MjAxNzA1MTdfNTIg/MDAxNDk0OTgyMzA1MTAz.9iFDPXwsyppwqOZ24zP2H_Fwe6WntZfApYjrwF9Dq8gg.MVvJMiqog583u6_h3bvtj5XLUBfqdTf5zaQumfibYcYg.JPEG.skdbs5597/%B0%F8%C0%AF_%C7%C7%B1%D4%BE%EE_%BE%C6%C0%CC%BE%F0%B8%C7_.jpg");
		    bi = ImageIO.read(url);
		    ImageIO.write(bi, "jpg", outputFile);
		 
		} catch (MalformedURLException e) {
		   e.printStackTrace();
		} catch (IOException e) {
		   e.printStackTrace();
		}
	}
}
