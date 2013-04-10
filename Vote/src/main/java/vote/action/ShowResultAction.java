package vote.action;

import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import vote.model.VoteResult;

import javax.annotation.Resource;

@Results({@Result(name = "success", type = "json", params = {"root", "jsonResult"} )})
public class ShowResultAction extends ActionSupport{

    private VoteResult voteResult;
    private String jsonResult;

    @Action("showAction")
    public String show() {
        JSONObject json= JSONObject.fromObject(voteResult);
        jsonResult = json.toString();
        return SUCCESS;
    }

    public String getJsonResult() {
        return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
    }

    public VoteResult getVoteResult() {
        return voteResult;
    }

    @Resource
    public void setVoteResult(VoteResult voteResult) {
        this.voteResult = voteResult;
    }
}
