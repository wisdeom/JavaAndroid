package md5a5cfb4e338a6be57ab73f714f654876c;


public class MyViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("JavaTest.Droid.MyViewHolder, JavaTest.Droid", MyViewHolder.class, __md_methods);
	}


	public MyViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == MyViewHolder.class)
			mono.android.TypeManager.Activate ("JavaTest.Droid.MyViewHolder, JavaTest.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
