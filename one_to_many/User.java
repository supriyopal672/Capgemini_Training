package one_to_many;

public class User {
	String userName;
	Post[] post;
	static int index=0;

	public User(int size,String userName) {
		
		this.post= new Post[size];
		this.userName=userName;
	}
	
	
	public void addPost(Post posts) {
		if (index<this.post.length) {
			post[index++]=posts;
		}else {
			System.out.println("Cannot Add Post size is full...");
		}
	}
}
