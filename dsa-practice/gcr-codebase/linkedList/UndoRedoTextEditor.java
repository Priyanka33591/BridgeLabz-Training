class StateNode {
    String text;
    StateNode prev, next;

    StateNode(String text) {
        this.text = text;
    }
}

class TextEditor {
    StateNode current;

    void addState(String text) {
        StateNode node = new StateNode(text);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    void undo() {
        if (current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current.next != null)
            current = current.next;
    }
}
