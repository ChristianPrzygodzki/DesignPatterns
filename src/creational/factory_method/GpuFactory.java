package creational.factory_method;

import creational.factory_method.gpu.GraphicsCard;
import creational.factory_method.gpu.Hd7790;
import creational.factory_method.gpu.Hd7870;
import creational.factory_method.gpu.R9_270;

public class GpuFactory {

    public static GraphicsCard createGpu(GpuType gpuType) {
        switch (gpuType) {
            case HD7790:
                return new Hd7790();
            case HD7870:
                return new Hd7870();
            case R9_270:
                return new R9_270();
        }
        throw new IllegalArgumentException("The GPU type " + gpuType + " is unknown.");
    }
}
