package p056h0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p035e1.C0677s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.x */
/* loaded from: classes.dex */
public final class C1750x extends RippleDrawable {

    /* renamed from: e */
    public final boolean f10656e;

    /* renamed from: f */
    public C0677s f10657f;

    /* renamed from: g */
    public Integer f10658g;

    /* renamed from: h */
    public boolean f10659h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1750x(boolean z7) {
        super(r0, null, r2);
        ColorDrawable colorDrawable;
        ColorStateList valueOf = ColorStateList.valueOf(-16777216);
        if (z7) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        this.f10656e = z7;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f10656e) {
            this.f10659h = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f10659h = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f10659h;
    }
}
