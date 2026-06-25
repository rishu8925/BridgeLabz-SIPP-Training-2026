interface TextModeration {
    boolean checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive content allowed");
    }

    static boolean containsRestrictedWords(String post) {
        return post.contains("bad");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam allowed");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    public boolean checkText(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {
        return post.contains("buy now");
    }

    public void displayModerationPolicy() {
        System.out.println("Spam and offensive content prohibited");
    }
}

public class ContentModeration {
    public static void main(String[] args) {
        String[] posts = {
            "Hello everyone",
            "buy now limited offer",
            "This is bad content"
        };

        ContentModerator moderator = new ContentModerator();

        for (String post : posts) {
            if (moderator.checkSpam(post))
                System.out.println(post + " -> Spam Post");
            else if (moderator.checkText(post))
                System.out.println(post + " -> Offensive Post");
            else
                System.out.println(post + " -> Valid Post");
        }
    }
}