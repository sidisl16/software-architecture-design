package com.sid.learning.singleton.pattern;

public class Downloader {

	// Eager approach
	// private static Downloader downloader = new Downloader();

	private static Downloader downloader;

	public static Downloader getInstance() {
		
		if(downloader == null) {
			downloader = new Downloader();
		}
		return downloader;
	}

	public void download() {
		System.out.println("Downloading from web...");
	}

}
