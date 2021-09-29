package com.company.studios.studio7;

public class CD extends BaseDisc implements OpticalDiscInterface {

    public CD(String title, String author, Double storageCapacity, String diskType) {
        super(title, author, storageCapacity, diskType);
    }
    public CD(String title, String author, String diskType) {
        this(title, author, 700.0, diskType);
    }


    @Override
    public void spinDisk() {
        System.out.println("The cd is spinning....");
    }

    @Override
    public void pause() {
        System.out.println("The cd is paused....");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
