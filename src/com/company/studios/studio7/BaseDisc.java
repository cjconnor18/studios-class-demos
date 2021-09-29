package com.company.studios.studio7;

public abstract class BaseDisc {

    private String title;
    private String author;
    private Double storageCapacity;
    private String diskType;

    public BaseDisc(String title, String author, Double storageCapacity, String diskType) {
        this.title = title;
        this.author = author;
        this.storageCapacity = storageCapacity;
        this.diskType = diskType;
    }

    public void readData() {
        System.out.println("Currently reading " + this.title + " disc...");
    }

    public void storeData() {
        System.out.println("Something Random according to Rafa...Saving to disk. " + this.diskType);
    }

    public boolean writeData(double dataSize) {
        if(dataSize > storageCapacity) {
            return false;
        }
        return true;
    }

    public void reportInformation() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Storage Capacity: " + this.storageCapacity);
        System.out.println("disk type: " + this.diskType);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
