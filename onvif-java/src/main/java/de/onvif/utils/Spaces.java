/*
 * Copyright 2018 Alessio Iannone
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions: The above copyright
 * notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.onvif.utils;

import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * List the available spaces. <br>
 * <p>
 * Each space has a proper domain. Here we provide a default initialization. You have to properly initialize them by
 * reading from the Configuration.
 * <br>
 * Actually this implementation has some drawback, so please be careful because this will change as soon as possible.
 * Indeed the Spaces depends on the device, but by using enums we are not allowing to have specific spaces per device.
 * So please consider this as experimental and subject to change as soon as possible
 * </p>
 * 
 * @author Alessio Iannone - quonn77@gmail.com
 *
 */
public class Spaces {

    @ToString
    public static enum PanTiltPositionSpace {
        //@formatter:off
        ABSOLUTE_GENERIC("http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace",-1,1,-1,1),
        ABSOLUTE_SPHERICAL("http://www.onvif.org/ver10/tptz/PanTiltSpaces/SphericalPositionSpaceDegrees",-180,180,-20,90),
        RELATIVE_GENERIC("http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationGenericSpace",-1,1,-1,1),
        RELATIVE_SPHERICAL("http://www.onvif.org/ver10/tptz/PanTiltSpaces/SphericalTranslationSpaceDegrees",-360,360,-360,360),
        RELATIVE_FOV("http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationSpaceFov",-1,1,-1,1);
        //@formatter:on
        PanTiltPositionSpace(String space, float xMin, float xMax, float yMin, float yMax) {
            this.space = space;
            this.xMin = xMin;
            this.xMax = xMax;
            this.yMin = yMin;
            this.yMax = yMax;
        }

        @Getter
        @Setter
        private String space;

        @Getter
        @Setter
        private float xMin;

        @Getter
        @Setter
        private float xMax;

        @Getter
        @Setter
        private float yMin;

        @Getter
        @Setter
        private float yMax;

        /**
         * Retrieve the {@link PanTiltPositionSpace} according to the input space, if the space is not valid by default
         * ABSOLUTE_SPHERICAL
         * 
         * @param space
         * @return
         */
        public static PanTiltPositionSpace fromSpace(String space) {
            return Arrays.asList(PanTiltPositionSpace.values()).stream().filter(ps -> ps.getSpace().equals(space))
                    .findFirst().orElse(PanTiltPositionSpace.ABSOLUTE_SPHERICAL);
        }

        /**
         * 
         * @param val
         * @return
         */
        public boolean belongToYRange(float val) {
            float min = Math.min(yMin, yMax);
            float max = Math.max(yMin, yMax);
            return val >= min && val <= max;
        }

        /**
         * 
         * @param val
         * @return
         */
        public boolean belongToXRange(float val) {
            float min = Math.min(xMin, xMax);
            float max = Math.max(xMin, xMax);
            return val >= min && val <= max;
        }
    }

    /**
     * Spaces used for the zoom position
     */
    @ToString
    public static enum ZoomPositionSpace {
        //@formatter:off
        ABSOLUTE("http://www.onvif.org/ver10/tptz/ZoomSpaces/PositionGenericSpace", 0, 0.722f),
        RELATIVE("http://www.onvif.org/ver10/tptz/ZoomSpaces/TranslationGenericSpace", -1, 1);
        //@formatter:on

        @Getter
        private String space;
        @Getter
        @Setter
        private float min;
        @Getter
        @Setter
        private float max;

        private ZoomPositionSpace(String space, float min, float max) {
            this.space = space;
            this.min = min;
            this.max = max;
        }

        /**
         * 
         * @param space
         * @return
         */
        public static ZoomPositionSpace fromSpace(String space) {
            if (ABSOLUTE.getSpace().equals(space))
                return ABSOLUTE;
            return RELATIVE;
        }

    }

    /**
     * Speed Spaces for both Zoom (Starting with ZOOM_) and PanTilt (PT_)
     * 
     * @author Alessio Iannone
     *
     */
    @ToString
    public static enum SpeedSpace {
        // @formatter:off
        PT_CONTINUOUS("http://www.onvif.org/ver10/tptz/PanTiltSpaces/VelocityGenericSpace", -1, 1, -1, 1),
        PT_NORMAL("http://www.onvif.org/ver10/tptz/PanTiltSpaces/GenericSpeedSpace", 0, 1, 0,0),
        ZOOM_CONTINUOUS("http://www.onvif.org/ver10/tptz/ZoomSpaces/VelocityGenericSpace", -1, 1, -1,1), 
        ZOOM_NORMAL("http://www.onvif.org/ver10/tptz/ZoomSpaces/ZoomGenericSpeedSpace", 0, 1, 0, 0);
        // @formatter:on
        @Getter
        private String space;
        @Getter
        private float xMin;
        @Getter
        private float xMax;
        @Getter
        private float yMin;
        @Getter
        private float yMax;

        /**
         * 
         * @param space
         * @param xMin
         * @param xMax
         * @param yMin
         * @param yMax
         */
        private SpeedSpace(String space, float xMin, float xMax, float yMin, float yMax) {
            this.space = space;
            this.xMin = xMin;
            this.xMax = xMax;
            this.yMin = yMin;
            this.yMax = yMax;
        }
    }
}
