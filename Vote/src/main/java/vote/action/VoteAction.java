package vote.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import vote.model.VoteResult;
import javax.annotation.Resource;

@Results({@Result(name = "success", type = "json")})
public class VoteAction extends ActionSupport{

    private VoteResult voteResult;
    private int id;

    @Action("voteAction")
    public String vote() {
        switch(id) {
            case 1:
                voteResult.votePersonOne();
                break;
            case 2:
                voteResult.votePersonTwo();
                break;
            case 3:
                voteResult.votePersonThree();
                break;
            case 4:
                voteResult.votePersonFour();
                break;
            case 5:
                voteResult.votePersonFive();
                break;
            default:
                break;
        }
        return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Resource
    public void setVoteResult(VoteResult voteResult) {
        this.voteResult = voteResult;
    }
}
