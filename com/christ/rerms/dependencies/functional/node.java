public class node {
    char NodeType; // 'p'- producer, 'c'- consumer, 'b'-store and release from battery
    int curr_capacity; // battery capacity in percentage
    boolean status; // true - active, false - not active
    float Wattage; // total power to supply/supplied to the node
    static int capacity = 1000; // Each battery is of capcity 1000MWh
    // String CommisionDate;

    Node(int curr_capacity) {
        this.curr_capacity = curr_capacity;
    }

    Node(boolean status, char NodeType, float Wattage) {
        this.status = status;
        this.NodeType = NodeType;
        this.Wattage = Wattage;
        if (NodeType == 'b') {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter battery capacity : ");
            this.curr_capacity = Integer.parseInt(br.readLine());
        }
    }
    
}
