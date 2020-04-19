package Member;

public class ActionForward {

	private boolean isRedirect = false;
	private String path = null;
	
	public boolean isRedirect()
	{
		return isRedirect;
	}
	
	public void setRedirect(boolean Redirect)
	{
		this.isRedirect = Redirect;
	}
	
	public String getPath()
	{
		return path;
	}
	
	public void setPath(String path)
	{
		this.path = path;
	}
}
