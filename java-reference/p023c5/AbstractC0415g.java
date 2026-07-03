package p023c5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p001a0.C0019e1;
import p001a0.C0068q2;
import p031d5.AbstractC0514n;
import p031d5.C0507g;
import p031d5.C0509i;
import p031d5.C0510j;
import p031d5.C0511k;
import p031d5.C0512l;
import p031d5.RunnableC0505e;
import p031d5.RunnableC0506f;
import p052g4.AbstractC1681i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.g */
/* loaded from: classes.dex */
public abstract class AbstractC0415g extends ViewGroup {

    /* renamed from: D */
    public static final /* synthetic */ int f1400D = 0;

    /* renamed from: A */
    public final SurfaceHolderCallbackC0413e f1401A;

    /* renamed from: B */
    public final C0019e1 f1402B;

    /* renamed from: C */
    public final C0414f f1403C;

    /* renamed from: e */
    public C0507g f1404e;

    /* renamed from: f */
    public final WindowManager f1405f;

    /* renamed from: g */
    public final Handler f1406g;

    /* renamed from: h */
    public boolean f1407h;

    /* renamed from: i */
    public SurfaceView f1408i;

    /* renamed from: j */
    public TextureView f1409j;

    /* renamed from: k */
    public boolean f1410k;

    /* renamed from: l */
    public final C0427s f1411l;

    /* renamed from: m */
    public int f1412m;

    /* renamed from: n */
    public final ArrayList f1413n;

    /* renamed from: o */
    public C0512l f1414o;

    /* renamed from: p */
    public C0510j f1415p;

    /* renamed from: q */
    public C0432x f1416q;

    /* renamed from: r */
    public C0432x f1417r;

    /* renamed from: s */
    public Rect f1418s;

    /* renamed from: t */
    public C0432x f1419t;

    /* renamed from: u */
    public Rect f1420u;

    /* renamed from: v */
    public Rect f1421v;

    /* renamed from: w */
    public C0432x f1422w;

    /* renamed from: x */
    public double f1423x;

    /* renamed from: y */
    public AbstractC0514n f1424y;

    /* renamed from: z */
    public boolean f1425z;

    public AbstractC0415g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1407h = false;
        this.f1410k = false;
        this.f1412m = -1;
        this.f1413n = new ArrayList();
        this.f1415p = new C0510j();
        this.f1420u = null;
        this.f1421v = null;
        this.f1422w = null;
        this.f1423x = 0.1d;
        this.f1424y = null;
        this.f1425z = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.f1401A = new SurfaceHolderCallbackC0413e(barcodeView);
        C0411c c0411c = new C0411c(barcodeView, 1);
        this.f1402B = new C0019e1((Object) barcodeView);
        this.f1403C = new C0414f(0, barcodeView);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        m896b(attributeSet);
        this.f1405f = (WindowManager) context.getSystemService("window");
        this.f1406g = new Handler(c0411c);
        this.f1411l = new C0427s(1);
    }

    /* renamed from: a */
    public static void m895a(BarcodeView barcodeView) {
        if (barcodeView.f1404e != null && barcodeView.getDisplayRotation() != barcodeView.f1412m) {
            barcodeView.m977g();
            barcodeView.m897c();
        }
    }

    private int getDisplayRotation() {
        return this.f1405f.getDefaultDisplay().getRotation();
    }

    /* renamed from: b */
    public final void m896b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1681i.f10465a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f1422w = new C0432x(dimension, dimension2);
        }
        this.f1407h = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f1424y = new C0511k(0);
        } else if (integer == 2) {
            this.f1424y = new C0511k(1);
        } else if (integer == 3) {
            this.f1424y = new C0511k(2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d5.g, java.lang.Object] */
    /* renamed from: c */
    public final void m897c() {
        AbstractC0000a.m20u();
        Log.d("g", "resume()");
        if (this.f1404e != null) {
            Log.w("g", "initCamera called twice");
        } else {
            Context context = getContext();
            ?? obj = new Object();
            obj.f1809f = false;
            obj.f1810g = true;
            obj.f1812i = new C0510j();
            RunnableC0506f runnableC0506f = new RunnableC0506f(obj, 0);
            obj.f1813j = new RunnableC0506f(obj, 1);
            obj.f1814k = new RunnableC0506f(obj, 2);
            obj.f1815l = new RunnableC0506f(obj, 3);
            AbstractC0000a.m20u();
            if (C0427s.f1459j == null) {
                C0427s.f1459j = new C0427s();
            }
            C0427s c0427s = C0427s.f1459j;
            obj.f1804a = c0427s;
            C0509i c0509i = new C0509i(context);
            obj.f1806c = c0509i;
            c0509i.f1826g = obj.f1812i;
            obj.f1811h = new Handler();
            C0510j c0510j = this.f1415p;
            if (!obj.f1809f) {
                obj.f1812i = c0510j;
                c0509i.f1826g = c0510j;
            }
            this.f1404e = obj;
            obj.f1807d = this.f1406g;
            AbstractC0000a.m20u();
            obj.f1809f = true;
            obj.f1810g = false;
            synchronized (c0427s.f1464i) {
                c0427s.f1461f++;
                c0427s.m905c(runnableC0506f);
            }
            this.f1412m = getDisplayRotation();
        }
        if (this.f1419t != null) {
            m899e();
        } else {
            SurfaceView surfaceView = this.f1408i;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f1401A);
            } else {
                TextureView textureView = this.f1409j;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f1409j.getSurfaceTexture();
                        this.f1419t = new C0432x(this.f1409j.getWidth(), this.f1409j.getHeight());
                        m899e();
                    } else {
                        this.f1409j.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0412d(this));
                    }
                }
            }
        }
        requestLayout();
        C0427s c0427s2 = this.f1411l;
        Context context2 = getContext();
        C0019e1 c0019e1 = this.f1402B;
        C0431w c0431w = (C0431w) c0427s2.f1463h;
        if (c0431w != null) {
            c0431w.disable();
        }
        c0427s2.f1463h = null;
        c0427s2.f1462g = null;
        c0427s2.f1464i = null;
        Context applicationContext = context2.getApplicationContext();
        c0427s2.f1464i = c0019e1;
        c0427s2.f1462g = (WindowManager) applicationContext.getSystemService("window");
        C0431w c0431w2 = new C0431w(c0427s2, applicationContext);
        c0427s2.f1463h = c0431w2;
        c0431w2.enable();
        c0427s2.f1461f = ((WindowManager) c0427s2.f1462g).getDefaultDisplay().getRotation();
    }

    /* renamed from: d */
    public final void m898d(C0068q2 c0068q2) {
        if (!this.f1410k && this.f1404e != null) {
            Log.i("g", "Starting preview");
            C0507g c0507g = this.f1404e;
            c0507g.f1805b = c0068q2;
            AbstractC0000a.m20u();
            if (c0507g.f1809f) {
                c0507g.f1804a.m905c(c0507g.f1814k);
                this.f1410k = true;
                ((BarcodeView) this).m978h();
                this.f1403C.m893g();
                return;
            }
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: e */
    public final void m899e() {
        Rect rect;
        float f7;
        C0432x c0432x = this.f1419t;
        if (c0432x != null && this.f1417r != null && (rect = this.f1418s) != null) {
            if (this.f1408i != null && c0432x.equals(new C0432x(rect.width(), this.f1418s.height()))) {
                SurfaceHolder holder = this.f1408i.getHolder();
                C0068q2 c0068q2 = new C0068q2(3, false);
                if (holder != null) {
                    c0068q2.f344f = holder;
                    m898d(c0068q2);
                    return;
                }
                throw new IllegalArgumentException("surfaceHolder may not be null");
            }
            TextureView textureView = this.f1409j;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (this.f1417r != null) {
                    int width = this.f1409j.getWidth();
                    int height = this.f1409j.getHeight();
                    C0432x c0432x2 = this.f1417r;
                    float f8 = height;
                    float f9 = width / f8;
                    float f10 = c0432x2.f1470e / c0432x2.f1471f;
                    float f11 = 1.0f;
                    if (f9 < f10) {
                        float f12 = f10 / f9;
                        f7 = 1.0f;
                        f11 = f12;
                    } else {
                        f7 = f9 / f10;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(f11, f7);
                    float f13 = width;
                    matrix.postTranslate((f13 - (f11 * f13)) / 2.0f, (f8 - (f7 * f8)) / 2.0f);
                    this.f1409j.setTransform(matrix);
                }
                SurfaceTexture surfaceTexture = this.f1409j.getSurfaceTexture();
                C0068q2 c0068q22 = new C0068q2(3, false);
                if (surfaceTexture != null) {
                    c0068q22.f345g = surfaceTexture;
                    m898d(c0068q22);
                    return;
                }
                throw new IllegalArgumentException("surfaceTexture may not be null");
            }
        }
    }

    public C0507g getCameraInstance() {
        return this.f1404e;
    }

    public C0510j getCameraSettings() {
        return this.f1415p;
    }

    public Rect getFramingRect() {
        return this.f1420u;
    }

    public C0432x getFramingRectSize() {
        return this.f1422w;
    }

    public double getMarginFraction() {
        return this.f1423x;
    }

    public Rect getPreviewFramingRect() {
        return this.f1421v;
    }

    public AbstractC0514n getPreviewScalingStrategy() {
        AbstractC0514n abstractC0514n = this.f1424y;
        if (abstractC0514n != null) {
            return abstractC0514n;
        }
        if (this.f1409j != null) {
            return new C0511k(0);
        }
        return new C0511k(1);
    }

    public C0432x getPreviewSize() {
        return this.f1417r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1407h) {
            TextureView textureView = new TextureView(getContext());
            this.f1409j = textureView;
            textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0412d(this));
            addView(this.f1409j);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f1408i = surfaceView;
        surfaceView.getHolder().addCallback(this.f1401A);
        addView(this.f1408i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        C0432x c0432x = new C0432x(i9 - i7, i10 - i8);
        this.f1416q = c0432x;
        C0507g c0507g = this.f1404e;
        if (c0507g != null && c0507g.f1808e == null) {
            int displayRotation = getDisplayRotation();
            C0512l c0512l = new C0512l(0);
            c0512l.f1837d = new C0511k(1);
            c0512l.f1835b = displayRotation;
            c0512l.f1836c = c0432x;
            this.f1414o = c0512l;
            c0512l.f1837d = getPreviewScalingStrategy();
            C0507g c0507g2 = this.f1404e;
            C0512l c0512l2 = this.f1414o;
            c0507g2.f1808e = c0512l2;
            c0507g2.f1806c.f1827h = c0512l2;
            AbstractC0000a.m20u();
            if (c0507g2.f1809f) {
                c0507g2.f1804a.m905c(c0507g2.f1813j);
                boolean z8 = this.f1425z;
                if (z8) {
                    C0507g c0507g3 = this.f1404e;
                    c0507g3.getClass();
                    AbstractC0000a.m20u();
                    if (c0507g3.f1809f) {
                        c0507g3.f1804a.m905c(new RunnableC0505e(0, c0507g3, z8));
                    }
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.f1408i;
        if (surfaceView != null) {
            Rect rect = this.f1418s;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        TextureView textureView = this.f1409j;
        if (textureView != null) {
            textureView.layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f1425z);
        return bundle;
    }

    public void setCameraSettings(C0510j c0510j) {
        this.f1415p = c0510j;
    }

    public void setFramingRectSize(C0432x c0432x) {
        this.f1422w = c0432x;
    }

    public void setMarginFraction(double d7) {
        if (d7 < 0.5d) {
            this.f1423x = d7;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(AbstractC0514n abstractC0514n) {
        this.f1424y = abstractC0514n;
    }

    public void setTorch(boolean z7) {
        this.f1425z = z7;
        C0507g c0507g = this.f1404e;
        if (c0507g != null) {
            AbstractC0000a.m20u();
            if (c0507g.f1809f) {
                c0507g.f1804a.m905c(new RunnableC0505e(0, c0507g, z7));
            }
        }
    }

    public void setUseTextureView(boolean z7) {
        this.f1407h = z7;
    }
}
