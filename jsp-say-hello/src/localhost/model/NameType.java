package localhost.model;

/**
 * Created by lbuthman on 6/17/17.
 */
public enum NameType {

    VAMPIRE { public String welcomeType(String name) {
        return "Hi vampire " + name + ". I guess garlic-y food is out ...";}},
    DEMI_GOD { public String welcomeType(String name) {
        return "Welcome esteemed Demi-God " + name + ". Would you like some mead?";}},
    SPIRIT { public String welcomeType(String name) {
        return "Sorry I didn't see you " + name + " the spirit. I like how you randomly appear!";}},
    MORPHING_ENTITY { public String welcomeType(String name) {
        return "Interesting shape you have choosen " + name + ". So bold and daring.";}};

    public abstract String welcomeType(String name);
}
