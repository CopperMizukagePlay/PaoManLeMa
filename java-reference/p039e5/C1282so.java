package p039e5;

import java.util.Collection;
import java.util.List;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.so */
/* loaded from: classes.dex */
public final /* synthetic */ class C1282so implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7644e;

    /* renamed from: f */
    public final /* synthetic */ Object f7645f;

    /* renamed from: g */
    public final /* synthetic */ int f7646g;

    public /* synthetic */ C1282so(int i7, Collection collection) {
        this.f7644e = 2;
        this.f7646g = i7;
        this.f7645f = collection;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f7644e) {
            case 0:
                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f7645f;
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                interfaceC3281e.mo22d(Integer.valueOf(this.f7646g), str);
                return C1694m.f10482a;
            case 1:
                InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) this.f7645f;
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "it");
                interfaceC3281e2.mo22d(Integer.valueOf(this.f7646g), str2);
                return C1694m.f10482a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f7646g, (Collection) this.f7645f));
        }
    }

    public /* synthetic */ C1282so(InterfaceC3281e interfaceC3281e, int i7, int i8) {
        this.f7644e = i8;
        this.f7645f = interfaceC3281e;
        this.f7646g = i7;
    }
}
