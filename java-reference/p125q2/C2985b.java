package p125q2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p008b.C0226c0;
import p027d1.C0467e;
import p035e1.AbstractC0663k0;
import p085l0.AbstractC2418w;
import p085l0.C2352e0;
import p085l0.C2361g1;
import p110o2.AbstractC2814k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q2.b */
/* loaded from: classes.dex */
public final class C2985b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: e */
    public final AbstractC0663k0 f15417e;

    /* renamed from: f */
    public final float f15418f;

    /* renamed from: g */
    public final C2361g1 f15419g = AbstractC2418w.m3980x(new C0467e(9205357640488583168L));

    /* renamed from: h */
    public final C2352e0 f15420h = AbstractC2418w.m3974q(new C0226c0(14, this));

    public C2985b(AbstractC0663k0 abstractC0663k0, float f7) {
        this.f15417e = abstractC0663k0;
        this.f15418f = f7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC2814k.m4443b(textPaint, this.f15418f);
        textPaint.setShader((Shader) this.f15420h.getValue());
    }
}
