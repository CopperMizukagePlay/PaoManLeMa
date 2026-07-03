package p051g3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.paoman.lema.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.p */
/* loaded from: classes.dex */
public final class C1651p {

    /* renamed from: d */
    public static final ArrayList f10416d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f10417a;

    /* renamed from: b */
    public SparseArray f10418b;

    /* renamed from: c */
    public WeakReference f10419c;

    /* renamed from: a */
    public final View m2694a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f10417a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View m2694a = m2694a(viewGroup.getChildAt(childCount));
                    if (m2694a != null) {
                        return m2694a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            return null;
        }
        return null;
    }
}
