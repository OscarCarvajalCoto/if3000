/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.lab02;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author oandr
 */
public class NodeProfe {

    private String name;
    private Boolean opinion;
    private Boolean exposed;
    private Set<NodeProfe> friends;
    private Set<NodeProfe> friendWhoAsk;

    public String getName() {
        return name;
    }

    public NodeProfe(String name) {
        this.name = name;
        opinion = false;
        exposed = false;
        friends = new HashSet<>();
        friendWhoAsk = new HashSet<>();
    }

    public Boolean getOpinion(NodeProfe who) {
        if (friends.size() == friendWhoAsk.size()) {
            return opinion;
        } else {
            friendWhoAsk.add(who);
            return false;
        }

    }

    public void opinionPositive() {
        friendWhoAsk.clear();
        opinion = true;
    }

    public void reviewOpinion() {
        Long opinion1 = friends.stream()
                .filter(node -> node.getOpinion(this))
                .count();

        Long opinion2 = 0L;
        for (NodeProfe node : friends) {
            if (node.getOpinion(this)) {
                opinion2++;
            }
        }
        if (friends.size() / 2 >= opinion1) {
            opinionPositive();
        }
    }

}
