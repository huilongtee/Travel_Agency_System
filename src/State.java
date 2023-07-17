public class State {
    private String stateName;
    protected State(){
        this("Johor Bahru");
    }

    protected State(String stateName){
        this.stateName=stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
