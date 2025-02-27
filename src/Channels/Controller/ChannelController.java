package Channels.Controller;
import Channels.Model.Channel;
import Channels.Model.Comment;

    public class ChannelController {

        /**
         * Discussion variables to control
         */
        public Channel channel;
        public Comment comment;

        /**
         * Constructor
         * @param channel
         * @param comment
         */
        public ChannelController(Channel channel, Comment comment) {
            this.channel = channel;
            this.comment= comment;
        }

        /**
         * getters and setters
         * and methods for creating and deleting comments and channels
         * @return
         */

        public Channel getChannel() {
            return channel;
        }
        public void setChannel(Channel channel) {
            this.channel = channel;
        }
        public Channel createChannel(){return channel;}
        public void deleteChannel(){}

        public Comment getComment() {
            return comment;
        }
        public void setComment(Comment comment) {
            this.comment = comment;
        }
        public Comment createComment(){return comment;}
        public void deleteComment(){}

    }
