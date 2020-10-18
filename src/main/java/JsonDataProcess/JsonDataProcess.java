package JsonDataProcess;
import java.io.BufferedReader;
import java.io.IOException;

public class JsonDataProcess {
    private String JsonString=null;
    public BufferedReader ReadString;
    public JsonDataProcess(BufferedReader ReadString) throws IOException {
        this.ReadString=ReadString;
    }
    public boolean WhetherDataIsNull() throws IOException {
        JsonString= ReadString.readLine();
        if(JsonString==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String ReturnDataToController()
    {
        return JsonString;
    }
    public void CloseStream() throws IOException {
        ReadString.close();
    }
}
