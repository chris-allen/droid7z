package com.droid7z;


/**
 * Droid7z
 * </p>
 * This is a wrapper for JNI bindings to the 7zip compression library.
 * </p>
 * Credit goes to the author of the library that it is based on.  You can
 * get its source here: <b>http://code.google.com/p/andro7z/source/checkout</b>
 * 
 */
public final class Droid7z {
    
	/**Uncompress all files from an archive to a destination
	 * 
	 * @param dest Directory to put uncompressed files
	 * @param archive 7zip file
	 * @return 0 for success
	 */
	public static int uncompress(String dest, String archive) {
		return uncompress(dest, archive, new String[]{});
	}
	
	/**Uncompress targeted files from an archive to a destination
	 * 
	 * @param dest Directory to put uncompressed files
	 * @param archive 7zip file
	 * @param files Array of filenames to be uncompressed
	 * @return 0 for success
	 */
	public static native int uncompress(String dest, String archive, Object[] files);	
    
    static {
        System.loadLibrary("7za");
    }
 }
