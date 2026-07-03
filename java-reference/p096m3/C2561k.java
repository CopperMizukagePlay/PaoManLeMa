package p096m3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.InterfaceC0183e;
import androidx.lifecycle.InterfaceC0213t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.k */
/* loaded from: classes.dex */
public final class C2561k implements InterfaceC0183e {

    /* renamed from: e */
    public final /* synthetic */ C0216v f13937e;

    public C2561k(EmojiCompatInitializer emojiCompatInitializer, C0216v c0216v) {
        this.f13937e = c0216v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.InterfaceC0183e
    /* renamed from: b */
    public final void mo450b(InterfaceC0213t interfaceC0213t) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = AbstractC2552b.m4080a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Object(), 500L);
        this.f13937e.m473f(this);
    }
}
