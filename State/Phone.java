package State;

class Phone {
    private PhoneState state;

    public Phone() {
        state = new LockedState();
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void pressPowerButton() {
        state.pressPowerButton(this);
    }

    public void incomingCall() {
        state.incomingCall(this);
    }

    public void answerCall() {
        state.answerCall(this);
    }

    public void hangUp() {
        state.hangUp(this);
    }
}
