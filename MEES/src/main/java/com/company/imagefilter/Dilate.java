package com.company.imagefilter;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Size;
import org.opencv.imgproc.Imgproc;

import static org.bytedeco.opencv.global.opencv_imgproc.dilate;
import static org.bytedeco.opencv.global.opencv_imgproc.getStructuringElement;

public class Dilate extends Filter {
   // public Mat filterDilate(Mat image, Log l) throws JavaCVHelperException {
        @Override
        Mat process(Mat image) throws JavaCVHelperException {


            int size = 8;
            Mat result = image.clone();
            Mat element = getStructuringElement(Imgproc.MORPH_RECT, new Size(2 * size + 1, 2 * size + 1));
            dilate(image, result, element);
            App.l.Log(" image " + image + "\n" + "filtre : " + Dilate.class.getSimpleName() + "\n");

            if (result == null) {
                throw new JavaCVHelperException("la dilatation ne marche pas");

            }
            return result;
        }

    }
