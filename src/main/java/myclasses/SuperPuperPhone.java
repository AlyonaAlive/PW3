package myclasses;

import java.util.Collection;

public class SuperPuperPhone implements Telephone {
	public SuperPuperPhone(){}
	public void call() {
		for(ShareFile myfile: files){
			myfile.share();
		}
	}
	private Collection <ShareFile> files;
	//@Autowired(required=false)
	public void setFiles(Collection<ShareFile> files) {
		this.files = files;
	}
	

}
