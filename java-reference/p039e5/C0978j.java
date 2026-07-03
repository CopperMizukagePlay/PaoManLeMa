package p039e5;

import java.util.ArrayList;
import java.util.List;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0978j implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f5000e;

    /* renamed from: f */
    public final /* synthetic */ String f5001f;

    public /* synthetic */ C0978j(String str, int i7) {
        this.f5000e = i7;
        this.f5001f = str;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f5000e) {
            case 0:
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                return C0800d9.m1498a(c0800d9, this.f5001f, null, null, 0L, 0L, 0L, false, null, 0L, null, null, 4194299);
            default:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!AbstractC3367j.m5096a(((C0800d9) obj2).f3340a, this.f5001f)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
