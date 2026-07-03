package p172w3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import p053g5.C1687f;
import p060h5.AbstractC1805m;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w3.a */
/* loaded from: classes.dex */
public final class C3777a implements InterfaceC3780d {

    /* renamed from: a */
    public final LinkedHashSet f17913a = new LinkedHashSet();

    public C3777a(C3781e c3781e) {
        c3781e.m5787l("androidx.savedstate.Restarter", this);
    }

    @Override // p172w3.InterfaceC3780d
    /* renamed from: a */
    public final Bundle mo462a() {
        ArrayList<String> arrayList;
        Bundle m5138i = AbstractC3393k.m5138i((C1687f[]) Arrays.copyOf(new C1687f[0], 0));
        List m3035C0 = AbstractC1805m.m3035C0(this.f17913a);
        if (m3035C0 instanceof ArrayList) {
            arrayList = (ArrayList) m3035C0;
        } else {
            arrayList = new ArrayList<>(m3035C0);
        }
        m5138i.putStringArrayList("classes_to_restore", arrayList);
        return m5138i;
    }
}
