package seedu.addressbook.data.exception;

import java.io.FileNotFoundException;

import seedu.addressbook.storage.StorageFile;

public class StorageFileNotFoundException extends FileNotFoundException{
	public StorageFileNotFoundException(){
		super(StorageFile.DEFAULT_STORAGE_FILEPATH + " not found.");
	}
}
