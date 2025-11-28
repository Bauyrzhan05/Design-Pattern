package State;

class UnlockedState implements PhoneState {
    @Override
    public void pressPowerButton(Phone phone) {
        System.out.println("Phone locked.");
        phone.setState(new LockedState());
    }

    @Override
    public void incomingCall(Phone phone) {
        System.out.println("Incoming call!");
        phone.setState(new RingingState());
    }

    @Override
    public void answerCall(Phone phone) {
        System.out.println("No call to answer.");
    }

    @Override
    public void hangUp(Phone phone) {
        System.out.println("No active call to hang up.");
    }
}
