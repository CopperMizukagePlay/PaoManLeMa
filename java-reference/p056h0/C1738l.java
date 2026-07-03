package p056h0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.paoman.lema.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p001a0.C0068q2;
import p060h5.AbstractC1806n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.l */
/* loaded from: classes.dex */
public final class C1738l extends ViewGroup {

    /* renamed from: e */
    public final int f10617e;

    /* renamed from: f */
    public final ArrayList f10618f;

    /* renamed from: g */
    public final ArrayList f10619g;

    /* renamed from: h */
    public final C0068q2 f10620h;

    /* renamed from: i */
    public int f10621i;

    public C1738l(Context context) {
        super(context);
        this.f10617e = 5;
        ArrayList arrayList = new ArrayList();
        this.f10618f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10619g = arrayList2;
        this.f10620h = new C0068q2(9);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f10621i = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C1740n m2791a(InterfaceC1739m interfaceC1739m) {
        Object remove;
        View view;
        C0068q2 c0068q2 = this.f10620h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0068q2.f344f;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0068q2.f344f;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0068q2.f345g;
        C1740n c1740n = (C1740n) linkedHashMap.get(interfaceC1739m);
        if (c1740n != null) {
            return c1740n;
        }
        ArrayList arrayList = this.f10619g;
        AbstractC3367j.m5100e(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            remove = null;
        } else {
            remove = arrayList.remove(0);
        }
        C1740n c1740n2 = (C1740n) remove;
        C1740n c1740n3 = c1740n2;
        if (c1740n2 == null) {
            int i7 = this.f10621i;
            ArrayList arrayList2 = this.f10618f;
            if (i7 > AbstractC1806n.m3066N(arrayList2)) {
                View view2 = new View(getContext());
                addView(view2);
                arrayList2.add(view2);
                view = view2;
            } else {
                C1740n c1740n4 = (C1740n) arrayList2.get(this.f10621i);
                InterfaceC1739m interfaceC1739m2 = (InterfaceC1739m) linkedHashMap3.get(c1740n4);
                view = c1740n4;
                if (interfaceC1739m2 != null) {
                    interfaceC1739m2.mo2782l0();
                    C1740n c1740n5 = (C1740n) linkedHashMap2.get(interfaceC1739m2);
                    if (c1740n5 != null) {
                    }
                    linkedHashMap2.remove(interfaceC1739m2);
                    c1740n4.m2794c();
                    view = c1740n4;
                }
            }
            int i8 = this.f10621i;
            if (i8 < this.f10617e - 1) {
                this.f10621i = i8 + 1;
                c1740n3 = view;
            } else {
                this.f10621i = 0;
                c1740n3 = view;
            }
        }
        linkedHashMap2.put(interfaceC1739m, c1740n3);
        linkedHashMap3.put(c1740n3, interfaceC1739m);
        return c1740n3;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
