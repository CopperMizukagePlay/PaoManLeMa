package p059h3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h3.a */
/* loaded from: classes.dex */
public final class C1775a extends ClickableSpan {

    /* renamed from: e */
    public final int f10811e;

    /* renamed from: f */
    public final C1782h f10812f;

    /* renamed from: g */
    public final int f10813g;

    public C1775a(int i7, C1782h c1782h, int i8) {
        this.f10811e = i7;
        this.f10812f = c1782h;
        this.f10813g = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f10811e);
        this.f10812f.f10826a.performAction(this.f10813g, bundle);
    }
}
