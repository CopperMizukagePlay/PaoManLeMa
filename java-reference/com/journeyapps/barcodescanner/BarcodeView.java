package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.paoman.lema.R;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import p000a.AbstractC0000a;
import p001a0.C0068q2;
import p022c4.EnumC0394d;
import p023c5.AbstractC0415g;
import p023c5.C0411c;
import p023c5.C0421m;
import p023c5.C0425q;
import p023c5.C0427s;
import p023c5.C0431w;
import p023c5.InterfaceC0422n;
import p031d5.C0507g;
import p031d5.RunnableC0504d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class BarcodeView extends AbstractC0415g {

    /* renamed from: E */
    public int f1514E;

    /* renamed from: F */
    public C0068q2 f1515F;

    /* renamed from: G */
    public C0425q f1516G;

    /* renamed from: H */
    public InterfaceC0422n f1517H;

    /* renamed from: I */
    public final Handler f1518I;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1514E = 1;
        this.f1515F = null;
        C0411c c0411c = new C0411c(this, 0);
        this.f1517H = new C0427s(0);
        this.f1518I = new Handler(c0411c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, c5.o] */
    /* JADX WARN: Type inference failed for: r1v7, types: [c4.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [c5.u, c5.m] */
    /* renamed from: f */
    public final C0421m m976f() {
        C0421m c0421m;
        if (this.f1517H == null) {
            this.f1517H = new C0427s(0);
        }
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0394d.NEED_RESULT_POINT_CALLBACK, obj);
        C0427s c0427s = (C0427s) this.f1517H;
        c0427s.getClass();
        EnumMap enumMap = new EnumMap(EnumC0394d.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = (EnumMap) c0427s.f1463h;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Collection collection = (Collection) c0427s.f1462g;
        if (collection != null) {
            enumMap.put((EnumMap) EnumC0394d.POSSIBLE_FORMATS, (EnumC0394d) collection);
        }
        String str = (String) c0427s.f1464i;
        if (str != null) {
            enumMap.put((EnumMap) EnumC0394d.CHARACTER_SET, (EnumC0394d) str);
        }
        ?? obj2 = new Object();
        obj2.m877c(enumMap);
        int i7 = c0427s.f1461f;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    c0421m = new C0421m(obj2);
                } else {
                    ?? c0421m2 = new C0421m(obj2);
                    c0421m2.f1465c = true;
                    c0421m = c0421m2;
                }
            } else {
                c0421m = new C0421m(obj2);
            }
        } else {
            c0421m = new C0421m(obj2);
        }
        obj.f1446a = c0421m;
        return c0421m;
    }

    /* renamed from: g */
    public final void m977g() {
        TextureView textureView;
        SurfaceView surfaceView;
        m979i();
        AbstractC0000a.m20u();
        Log.d("g", "pause()");
        this.f1412m = -1;
        C0507g c0507g = this.f1404e;
        if (c0507g != null) {
            AbstractC0000a.m20u();
            if (c0507g.f1809f) {
                c0507g.f1804a.m905c(c0507g.f1815l);
            } else {
                c0507g.f1810g = true;
            }
            c0507g.f1809f = false;
            this.f1404e = null;
            this.f1410k = false;
        } else {
            this.f1406g.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f1419t == null && (surfaceView = this.f1408i) != null) {
            surfaceView.getHolder().removeCallback(this.f1401A);
        }
        if (this.f1419t == null && (textureView = this.f1409j) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f1416q = null;
        this.f1417r = null;
        this.f1421v = null;
        C0427s c0427s = this.f1411l;
        C0431w c0431w = (C0431w) c0427s.f1463h;
        if (c0431w != null) {
            c0431w.disable();
        }
        c0427s.f1463h = null;
        c0427s.f1462g = null;
        c0427s.f1464i = null;
        this.f1403C.m894j();
    }

    public InterfaceC0422n getDecoderFactory() {
        return this.f1517H;
    }

    /* renamed from: h */
    public final void m978h() {
        m979i();
        if (this.f1514E != 1 && this.f1410k) {
            C0425q c0425q = new C0425q(getCameraInstance(), m976f(), this.f1518I);
            this.f1516G = c0425q;
            c0425q.f1454f = getPreviewFramingRect();
            C0425q c0425q2 = this.f1516G;
            c0425q2.getClass();
            AbstractC0000a.m20u();
            HandlerThread handlerThread = new HandlerThread("q");
            c0425q2.f1450b = handlerThread;
            handlerThread.start();
            c0425q2.f1451c = new Handler(c0425q2.f1450b.getLooper(), c0425q2.f1457i);
            c0425q2.f1455g = true;
            C0507g c0507g = c0425q2.f1449a;
            c0507g.f1811h.post(new RunnableC0504d(c0507g, c0425q2.f1458j, 0));
        }
    }

    /* renamed from: i */
    public final void m979i() {
        C0425q c0425q = this.f1516G;
        if (c0425q != null) {
            c0425q.getClass();
            AbstractC0000a.m20u();
            synchronized (c0425q.f1456h) {
                c0425q.f1455g = false;
                c0425q.f1451c.removeCallbacksAndMessages(null);
                c0425q.f1450b.quit();
            }
            this.f1516G = null;
        }
    }

    public void setDecoderFactory(InterfaceC0422n interfaceC0422n) {
        AbstractC0000a.m20u();
        this.f1517H = interfaceC0422n;
        C0425q c0425q = this.f1516G;
        if (c0425q != null) {
            c0425q.f1452d = m976f();
        }
    }
}
