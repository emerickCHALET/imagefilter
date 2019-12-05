package com.company.imagefilter;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Size;

import static org.bytedeco.opencv.global.opencv_imgproc.GaussianBlur;

public class Blur extends Filter  {
//    public Mat filterBlur(Mat image, Log l) throws JavaCVHelperException  {
//

    @Override
    Mat process(Mat image, int args, String file) throws JavaCVHelperException {
            Mat result = image.clone();
            GaussianBlur(image, result, new Size(args, args), 0);

            App.l.Log(" image " + file + "\n" + "filtre : " + Blur.class.getSimpleName() + "\n");

            if (result == null) {
                throw new JavaCVHelperException("le flou ne marche pas");

            }return result;
        }
        }

