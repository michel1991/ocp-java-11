package passingAnArrayOfValues;

public class Reindeer{
 @Music(genres="Blues", "Jazz")
 String favorite; // does not compile

 @Music(genres=)
 String mostDisliked; // does not compile

 @Music(genres=null)
 String other; // does not compile

 @Music(genres={})
 String alternate;

}
