package State;

class RingingState implements PhoneState {
    @Override
    public void pressPowerButton(Phone phone) {
        System.out.println("Cannot lock the phone while ringing.");
    }

    @Override
    public void incomingCall(Phone phone) {
        System.out.println("Already ringing.");
    }

    @Override
    public void answerCall(Phone phone) {
        System.out.println("Call answered. Talking...");
        phone.setState(new TalkingState());
    }

    @Override
    public void hangUp(Phone phone) {
        System.out.println("Call declined. Phone locked.");
        phone.setState(new LockedState());
    }
}

