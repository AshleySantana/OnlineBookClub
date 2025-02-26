package OnlineBookClub.Channels.Model;

public class Comment {

    String userName;
    String getUserName(){
        return userName;
    }
    String userComment;
    void setUserComment(String userComment){
        userComment = this.userComment;
    }
    public Comment(String username, String userComment){
        username = this.userName;
        userComment = this.userComment;
    }
}
