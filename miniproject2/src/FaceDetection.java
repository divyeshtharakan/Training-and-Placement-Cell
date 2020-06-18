

import org.opencv.highgui.*;
import org.opencv.videoio.VideoCapture;
import org.opencv.core.*; 
import org.opencv.imgcodecs.*;
import org.opencv.highgui.HighGui;
public class FaceDetection {
    public static void main (String args[]){
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    	VideoCapture camera = new VideoCapture();
    	
    	if(!camera.isOpened()){
    		System.out.println("Error");
    	}
    	else {
    		Mat frame = new Mat();
    	    while(true){
    	    	if (camera.read(frame)){
    	    		System.out.println("Frame Obtained");
    	    		System.out.println("Captured Frame Width " + 
    	    		frame.width() + " Height " + frame.height());
    	    		//Imgcodecs.IMWRITE_JPEG_QUALITY("camera.jpg", frame);
    	    	Imgcodecs.imwrite("camera.jpg", frame);
    	    		System.out.println("OK");
    	    		break;
    	    	}
    	    }	
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	}
    	camera.release();
    }
}   