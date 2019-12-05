package com.company.imagefilter;

import org.bytedeco.opencv.opencv_core.Mat;

import org.opencv.core.CvType;
import org.opencv.imgproc.Imgproc;

import javax.annotation.processing.Filer;
import java.io.FileWriter;
import java.io.IOException;

import static org.bytedeco.opencv.global.opencv_imgproc.cvtColor;

public class BlackAndWhite extends Filter {
    /**
     * A VOIR
     * @param image Images Processed
     * @param args Program Argument
     * @param file Output Directory
     * @return result = Filtered Image
     * @throws JavaCVHelperException
     */
    @Override
    Mat process(Mat image, int args, String file) throws JavaCVHelperException {
        Mat result = new Mat(image.rows(), image.cols(), CvType.CV_8UC3);
        cvtColor(image, result, Imgproc.COLOR_RGB2GRAY);
        System.out.println(" image :" + file + "\n" + "filter : " + BlackAndWhite.class.getSimpleName() + "\n");
        App.l.Log(" image " + file + "\n" + "filter : " + BlackAndWhite.class.getSimpleName() + "\n");


        if (result == null) {
            throw new JavaCVHelperException("The grayscale doesn't work" );

        }return result;
    }
}
