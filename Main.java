class Main {
    public static void main(String[] args) {
        LinkList firstList = new LinkList();

        firstList.insert(10);
        firstList.insert(20);
        firstList.insert(30);
        firstList.insert(40);

        firstList.displayList();

        LinkList secondList = new LinkList();

        secondList.insert(50);
        secondList.insert(60);
        secondList.insert(70);
        secondList.insert(80);

        secondList.displayList();

        LinkList mergedList = mergeLinkList(firstList, secondList);

        mergedList.displayList();
    }

    public static LinkList mergeLinkList(LinkList firstList, LinkList secondList){
        if(firstList.head == null){
            return firstList;
        }

        if(secondList.head == null){
            return secondList;
        }

        Node current = firstList.head;

        while(current.next != null){
            current = current.next;
        }

        current.next = secondList.head;

        return firstList;
    }
}


