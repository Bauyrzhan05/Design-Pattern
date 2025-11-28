package State;

class LockedState implements PhoneState {
    public void pressPowerButton(Phone phone) {
        System.out.println("Phone unlocked.");
        phone.setState(new UnlockedState());
    }

    @Override
    public void incomingCall(Phone phone) {
        System.out.println("Incoming call. Phone is locked, ringing...");
        phone.setState(new RingingState());
    }

    @Override
    public void answerCall(Phone phone) {
        System.out.println("Can't answer the call while the phone is locked!");
    }

    @Override
    public void hangUp(Phone phone) {
        System.out.println("No active call to hang up.");
    }
}
