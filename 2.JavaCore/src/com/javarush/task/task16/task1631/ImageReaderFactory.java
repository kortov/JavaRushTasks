package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by eugenekortov on 05/03/17.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {
//        switch (type) {
//            case BMP:
//                return new BmpReader();
//            case JPG:
//                return new JpgReader();
//            case PNG:
//                return new PngReader();
//            default:
//                throw new  IllegalArgumentException("Неизвестный тип картинки");
//        }
        if (type == ImageTypes.BMP) {
            return new BmpReader();
        } else if (type == ImageTypes.JPG) {
            return new JpgReader();
        } else if (type == ImageTypes.PNG) {
            return new PngReader();
        } else {
            throw new  IllegalArgumentException("Неизвестный тип картинки");
        }

    }
}
