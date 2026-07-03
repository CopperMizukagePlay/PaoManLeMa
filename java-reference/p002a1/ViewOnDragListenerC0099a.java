package p002a1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.p007ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import p001a0.C0005b;
import p001a0.C0019e1;
import p002a1.ViewOnDragListenerC0099a;
import p077k.C2181b;
import p077k.C2191g;
import p144t.AbstractC3122c;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p162v1.EnumC3483a2;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC0099a implements View.OnDragListener, InterfaceC0100b {

    /* renamed from: a */
    public final C0103e f467a;

    /* renamed from: b */
    public final C2191g f468b;

    /* renamed from: c */
    public final AndroidDragAndDropManager$modifier$1 f469c;

    /* JADX WARN: Type inference failed for: r0v0, types: [a1.e, x0.q] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC0099a() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f475u = 0L;
        this.f467a = abstractC3809q;
        this.f468b = new C2191g();
        this.f469c = new AbstractC3556y0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return false;
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: h */
            public final AbstractC3809q mo312h() {
                return ViewOnDragListenerC0099a.this.f467a;
            }

            public final int hashCode() {
                return ViewOnDragListenerC0099a.this.f467a.hashCode();
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: i */
            public final /* bridge */ /* synthetic */ void mo313i(AbstractC3809q abstractC3809q2) {
            }
        };
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [u5.q, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0019e1 c0019e1 = new C0019e1(dragEvent);
        int action = dragEvent.getAction();
        EnumC3483a2 enumC3483a2 = EnumC3483a2.f16782e;
        C2191g c2191g = this.f468b;
        C0103e c0103e = this.f467a;
        switch (action) {
            case 1:
                ?? obj = new Object();
                C0102d c0102d = new C0102d(c0019e1, c0103e, obj);
                if (c0102d.mo23f(c0103e) == enumC3483a2) {
                    AbstractC3498f.m5386z(c0103e, c0102d);
                }
                boolean z7 = obj.f16446e;
                c2191g.getClass();
                C2181b c2181b = new C2181b(c2191g);
                while (c2181b.hasNext()) {
                    ((C0103e) c2181b.next()).m203O0(c0019e1);
                }
                return z7;
            case 2:
                c0103e.m202N0(c0019e1);
                return false;
            case 3:
                return c0103e.m199K0(c0019e1);
            case 4:
                C0005b c0005b = new C0005b(3, c0019e1);
                if (c0005b.mo23f(c0103e) == enumC3483a2) {
                    AbstractC3498f.m5386z(c0103e, c0005b);
                }
                c2191g.clear();
                return false;
            case AbstractC3122c.f15761f /* 5 */:
                c0103e.m200L0(c0019e1);
                return false;
            case AbstractC3122c.f15759d /* 6 */:
                c0103e.m201M0(c0019e1);
                return false;
            default:
                return false;
        }
    }
}
