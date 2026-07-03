package p170w1;

import android.view.View;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import java.util.ArrayList;
import p014b5.C0293g;
import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p032d6.InterfaceC0542j;
import p039e5.C1339uj;
import p053g5.C1694m;
import p069i6.C2090c;
import p082k5.InterfaceC2313c;
import p085l0.C2369i1;
import p085l0.C2414u1;
import p144t.AbstractC3122c;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.o2 */
/* loaded from: classes.dex */
public final class C3711o2 implements InterfaceC0209r {

    /* renamed from: e */
    public final /* synthetic */ C2090c f17651e;

    /* renamed from: f */
    public final /* synthetic */ C2369i1 f17652f;

    /* renamed from: g */
    public final /* synthetic */ C2414u1 f17653g;

    /* renamed from: h */
    public final /* synthetic */ C3379v f17654h;

    /* renamed from: i */
    public final /* synthetic */ View f17655i;

    public C3711o2(C2090c c2090c, C2369i1 c2369i1, C2414u1 c2414u1, C3379v c3379v, View view) {
        this.f17651e = c2090c;
        this.f17652f = c2369i1;
        this.f17653g = c2414u1;
        this.f17654h = c3379v;
        this.f17655i = view;
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        boolean z7;
        InterfaceC0542j interfaceC0542j = null;
        switch (AbstractC3707n2.f17623a[enumC0201n.ordinal()]) {
            case 1:
                AbstractC0525d0.m1141s(this.f17651e, null, new C1339uj(this.f17654h, this.f17653g, interfaceC0213t, this, this.f17655i, (InterfaceC2313c) null, 7), 1);
                return;
            case 2:
                C2369i1 c2369i1 = this.f17652f;
                if (c2369i1 != null) {
                    C0293g c0293g = (C0293g) c2369i1.f13413g;
                    synchronized (c0293g.f1068b) {
                        try {
                            synchronized (c0293g.f1068b) {
                                z7 = c0293g.f1067a;
                            }
                            if (!z7) {
                                ArrayList arrayList = (ArrayList) c0293g.f1069c;
                                c0293g.f1069c = (ArrayList) c0293g.f1070d;
                                c0293g.f1070d = arrayList;
                                c0293g.f1067a = true;
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    ((InterfaceC2313c) arrayList.get(i7)).mo663n(C1694m.f10482a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C2414u1 c2414u1 = this.f17653g;
                synchronized (c2414u1.f13580b) {
                    if (c2414u1.f13597s) {
                        c2414u1.f13597s = false;
                        interfaceC0542j = c2414u1.m3920t();
                    }
                }
                if (interfaceC0542j != null) {
                    ((C0548l) interfaceC0542j).mo663n(C1694m.f10482a);
                    return;
                }
                return;
            case 3:
                C2414u1 c2414u12 = this.f17653g;
                synchronized (c2414u12.f13580b) {
                    c2414u12.f13597s = true;
                }
                return;
            case 4:
                this.f17653g.m3919s();
                return;
            case AbstractC3122c.f15761f /* 5 */:
            case AbstractC3122c.f15759d /* 6 */:
            case 7:
                return;
            default:
                throw new RuntimeException();
        }
    }
}
