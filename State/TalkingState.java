package State;

class TalkingState implements PhoneState {
    @Override
    public void pressPowerButton(Phone phone) {
        System.out.println("Now we are talking.You can't block!");
    }

    @Override
    public void incomingCall(Phone phone) {
        System.out.println("Another call is coming, but you are talking.");
    }

    @Override
    public void answerCall(Phone phone) {
        System.out.println("You are talking now.");
    }

    @Override
    public void hangUp(Phone phone) {
        System.out.println("The conversation ended. The phone was blocked.");
        phone.setState(new LockedState());
    }
}
