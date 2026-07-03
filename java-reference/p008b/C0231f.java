package p008b;

import android.os.Bundle;
import android.os.Parcelable;
import com.paoman.lema.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p050g2.C1609r;
import p053g5.C1687f;
import p054g6.C1701c0;
import p054g6.InterfaceC1714o;
import p060h5.AbstractC1817y;
import p153u0.C3339f;
import p159u6.AbstractC3393k;
import p172w3.InterfaceC3780d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0231f implements InterfaceC3780d {

    /* renamed from: a */
    public final /* synthetic */ int f914a;

    /* renamed from: b */
    public final /* synthetic */ Object f915b;

    public /* synthetic */ C0231f(int i7, Object obj) {
        this.f914a = i7;
        this.f915b = obj;
    }

    @Override // p172w3.InterfaceC3780d
    /* renamed from: a */
    public final Bundle mo462a() {
        C1687f[] c1687fArr;
        ArrayList<? extends Parcelable> arrayList;
        switch (this.f914a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f915b;
                Bundle bundle = new Bundle();
                C0243l c0243l = mainActivity.f956l;
                c0243l.getClass();
                LinkedHashMap linkedHashMap = c0243l.f940b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0243l.f942d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0243l.f945g));
                return bundle;
            case 1:
                C1609r c1609r = (C1609r) this.f915b;
                for (Map.Entry entry : AbstractC1817y.m3087S((LinkedHashMap) c1609r.f10328e).entrySet()) {
                    c1609r.m2616j(((C1701c0) ((InterfaceC1714o) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : AbstractC1817y.m3087S((LinkedHashMap) c1609r.f10326c).entrySet()) {
                    c1609r.m2616j(((InterfaceC3780d) entry2.getValue()).mo462a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1609r.f10325b;
                if (linkedHashMap2.isEmpty()) {
                    c1687fArr = new C1687f[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new C1687f((String) entry3.getKey(), entry3.getValue()));
                    }
                    c1687fArr = (C1687f[]) arrayList2.toArray(new C1687f[0]);
                }
                return AbstractC3393k.m5138i((C1687f[]) Arrays.copyOf(c1687fArr, c1687fArr.length));
            default:
                Map mo5075d = ((C3339f) this.f915b).mo5075d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : mo5075d.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
        }
    }
}
