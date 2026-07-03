package p039e5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import com.paoman.lema.FloatingSpeedService;
import java.util.ArrayList;
import java.util.List;
import p032d6.C0545k;
import p053g5.C1687f;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.C1803k;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.oo */
/* loaded from: classes.dex */
public final class C1158oo extends View {

    /* renamed from: A */
    public final Paint f6691A;

    /* renamed from: B */
    public final Paint f6692B;

    /* renamed from: C */
    public final Paint f6693C;

    /* renamed from: D */
    public final Paint f6694D;

    /* renamed from: E */
    public final Paint f6695E;

    /* renamed from: F */
    public final Paint f6696F;

    /* renamed from: G */
    public final Paint f6697G;

    /* renamed from: H */
    public final Paint f6698H;

    /* renamed from: I */
    public final Paint f6699I;

    /* renamed from: J */
    public final Paint f6700J;

    /* renamed from: K */
    public final Paint f6701K;

    /* renamed from: L */
    public final Paint f6702L;

    /* renamed from: e */
    public C0833eb f6703e;

    /* renamed from: f */
    public C0833eb f6704f;

    /* renamed from: g */
    public C0833eb f6705g;

    /* renamed from: h */
    public C0833eb f6706h;

    /* renamed from: i */
    public C0833eb f6707i;

    /* renamed from: j */
    public C0833eb f6708j;

    /* renamed from: k */
    public C0545k f6709k;

    /* renamed from: l */
    public final C1803k f6710l;

    /* renamed from: m */
    public final C1803k f6711m;

    /* renamed from: n */
    public String f6712n;

    /* renamed from: o */
    public String f6713o;

    /* renamed from: p */
    public String f6714p;

    /* renamed from: q */
    public String f6715q;

    /* renamed from: r */
    public String f6716r;

    /* renamed from: s */
    public boolean f6717s;

    /* renamed from: t */
    public boolean f6718t;

    /* renamed from: u */
    public float f6719u;

    /* renamed from: v */
    public float f6720v;

    /* renamed from: w */
    public long f6721w;

    /* renamed from: x */
    public float f6722x;

    /* renamed from: y */
    public float f6723y;

    /* renamed from: z */
    public boolean f6724z;

    public C1158oo(FloatingSpeedService floatingSpeedService) {
        super(floatingSpeedService);
        this.f6710l = new C1803k();
        this.f6711m = new C1803k();
        this.f6712n = "跑满了吗";
        this.f6713o = "";
        this.f6714p = "--";
        this.f6715q = "--";
        this.f6716r = "Mbps";
        this.f6717s = true;
        this.f6691A = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(236, 18, 24, 34));
        this.f6692B = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setTextSize(34.0f);
        paint2.setFakeBoldText(true);
        this.f6693C = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.argb(190, 230, 236, 245));
        paint3.setTextSize(20.0f);
        this.f6694D = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(Color.argb(180, 230, 236, 245));
        paint4.setTextSize(18.0f);
        this.f6695E = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(-1);
        paint5.setTextSize(42.0f);
        paint5.setFakeBoldText(true);
        this.f6696F = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(Color.argb(170, 230, 236, 245));
        paint6.setTextSize(18.0f);
        this.f6697G = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(Color.argb(36, 255, 255, 255));
        paint7.setStrokeWidth(1.0f);
        this.f6698H = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(Color.rgb(77, 171, 247));
        paint8.setStrokeWidth(5.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint8.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint8.setStrokeJoin(join);
        this.f6699I = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.rgb(52, 211, 153));
        paint9.setStrokeWidth(5.0f);
        paint9.setStyle(style);
        paint9.setStrokeCap(cap);
        paint9.setStrokeJoin(join);
        this.f6700J = paint9;
        Paint paint10 = new Paint(1);
        paint10.setColor(Color.rgb(37, 99, 235));
        this.f6701K = paint10;
        Paint paint11 = new Paint(1);
        paint11.setColor(-1);
        paint11.setTextSize(20.0f);
        paint11.setTextAlign(Paint.Align.CENTER);
        paint11.setFakeBoldText(true);
        this.f6702L = paint11;
    }

    /* renamed from: d */
    public static void m2018d(Canvas canvas, RectF rectF, List list, float f7, Paint paint) {
        if (list.size() < 2) {
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        int i7 = 0;
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 >= 0) {
                float floatValue = ((Number) obj).floatValue();
                float f8 = rectF.left;
                float width = rectF.width() * i8;
                int i10 = 1;
                int size = list.size() - 1;
                if (size >= 1) {
                    i10 = size;
                }
                arrayList.add(new C1687f(Float.valueOf((width / i10) + f8), Float.valueOf(rectF.bottom - ((floatValue / f7) * rectF.height()))));
                i8 = i9;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        Path path = new Path();
        path.moveTo(((Number) ((C1687f) AbstractC1805m.m3045i0(arrayList)).f10471e).floatValue(), ((Number) ((C1687f) AbstractC1805m.m3045i0(arrayList)).f10472f).floatValue());
        int m3066N = AbstractC1806n.m3066N(arrayList);
        while (i7 < m3066N) {
            C1687f c1687f = (C1687f) arrayList.get(i7);
            i7++;
            C1687f c1687f2 = (C1687f) arrayList.get(i7);
            Object obj2 = c1687f.f10471e;
            Number number = (Number) c1687f.f10472f;
            path.quadTo(((Number) obj2).floatValue(), number.floatValue(), (((Number) c1687f2.f10471e).floatValue() + ((Number) c1687f.f10471e).floatValue()) / 2.0f, (((Number) c1687f2.f10472f).floatValue() + number.floatValue()) / 2.0f);
        }
        path.lineTo(((Number) ((C1687f) AbstractC1805m.m3052p0(arrayList)).f10471e).floatValue(), ((Number) ((C1687f) AbstractC1805m.m3052p0(arrayList)).f10472f).floatValue());
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    public final void m2019a(float f7, float f8) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        Float valueOf = Float.valueOf(f7);
        C1803k c1803k = this.f6710l;
        c1803k.addLast(valueOf);
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        Float valueOf2 = Float.valueOf(f8);
        C1803k c1803k2 = this.f6711m;
        c1803k2.addLast(valueOf2);
        while (c1803k.mo2999a() > 54) {
            c1803k.removeFirst();
        }
        while (c1803k2.mo2999a() > 54) {
            c1803k2.removeFirst();
        }
        invalidate();
    }

    /* renamed from: b */
    public final void m2020b(Canvas canvas, String str, RectF rectF) {
        float centerY = rectF.centerY();
        Paint paint = this.f6702L;
        canvas.drawText(str, rectF.centerX(), centerY - ((paint.ascent() + paint.descent()) / 2.0f), paint);
    }

    /* renamed from: c */
    public final void m2021c(Canvas canvas, RectF rectF) {
        int i7 = 0;
        while (i7 < 3) {
            i7++;
            float height = ((rectF.height() * i7) / 4.0f) + rectF.top;
            canvas.drawLine(rectF.left, height, rectF.right, height, this.f6698H);
        }
    }

    /* renamed from: e */
    public final void m2022e(Canvas canvas, String str, String str2, float f7, int i7) {
        int argb = Color.argb(180, Color.red(i7), Color.green(i7), Color.blue(i7));
        Paint paint = this.f6695E;
        paint.setColor(argb);
        canvas.drawText(str, f7, 130.0f, paint);
        canvas.drawText(str2, f7, 172.0f, this.f6696F);
        canvas.drawText(this.f6716r, f7 + 126.0f, 172.0f, this.f6697G);
    }

    /* renamed from: f */
    public final void m2023f(String str, String str2, String str3, String str4, String str5, boolean z7, boolean z8) {
        this.f6712n = str;
        this.f6713o = str2;
        this.f6714p = str3;
        this.f6715q = str4;
        this.f6716r = str5;
        this.f6717s = z7;
        this.f6718t = z8;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        AbstractC3367j.m5100e(canvas, "canvas");
        super.onDraw(canvas);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), Color.argb(248, 28, 36, 52), Color.argb(238, 12, 18, 30), Shader.TileMode.CLAMP);
        Paint paint = this.f6691A;
        paint.setShader(linearGradient);
        float f8 = 0.0f;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), 42.0f, 42.0f, paint);
        canvas.drawRoundRect(new RectF(4.0f, 4.0f, getWidth() - 4.0f, getHeight() - 4.0f), 38.0f, 38.0f, this.f6692B);
        canvas.drawText(this.f6712n, 28.0f, 48.0f, this.f6693C);
        canvas.drawText(this.f6713o, 28.0f, 80.0f, this.f6694D);
        String str = this.f6714p;
        Paint paint2 = this.f6699I;
        m2022e(canvas, "DOWNLOAD", str, 28.0f, paint2.getColor());
        Paint paint3 = this.f6700J;
        m2022e(canvas, "UPLOAD", this.f6715q, (getWidth() / 2.0f) + 16.0f, paint3.getColor());
        RectF rectF = new RectF(28.0f, 205.0f, getWidth() - 28.0f, 310.0f);
        float width = (rectF.width() - 20.0f) / 2.0f;
        float f9 = rectF.left;
        RectF rectF2 = new RectF(f9, rectF.top, width + f9, rectF.bottom);
        RectF rectF3 = new RectF(rectF2.right + 20.0f, rectF.top, rectF.right, rectF.bottom);
        C1803k c1803k = this.f6710l;
        Float m3055s0 = AbstractC1805m.m3055s0(c1803k);
        if (m3055s0 != null) {
            f7 = m3055s0.floatValue();
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(1.0f, f7);
        C1803k c1803k2 = this.f6711m;
        Float m3055s02 = AbstractC1805m.m3055s0(c1803k2);
        if (m3055s02 != null) {
            f8 = m3055s02.floatValue();
        }
        float max2 = Math.max(1.0f, f8);
        m2021c(canvas, rectF2);
        m2021c(canvas, rectF3);
        m2018d(canvas, rectF2, AbstractC1805m.m3035C0(c1803k), max, paint2);
        m2018d(canvas, rectF3, AbstractC1805m.m3035C0(c1803k2), max2, paint3);
        if (this.f6717s) {
            boolean z7 = this.f6718t;
            Paint paint4 = this.f6701K;
            if (z7) {
                RectF rectF4 = new RectF(28.0f, getHeight() - 72.0f, getWidth() - 28.0f, getHeight() - 26.0f);
                paint4.setColor(Color.rgb(220, 38, 38));
                canvas.drawRoundRect(rectF4, 23.0f, 23.0f, paint4);
                m2020b(canvas, "停止", rectF4);
                return;
            }
            float height = getHeight() - 72.0f;
            float height2 = getHeight() - 26.0f;
            float width2 = ((getWidth() - 56.0f) - 24.0f) / 3.0f;
            RectF rectF5 = new RectF(28.0f, height, width2 + 28.0f, height2);
            float f10 = rectF5.right + 12.0f;
            RectF rectF6 = new RectF(f10, height, width2 + f10, height2);
            RectF rectF7 = new RectF(rectF6.right + 12.0f, height, getWidth() - 28.0f, height2);
            paint4.setColor(Color.rgb(16, 185, 129));
            canvas.drawRoundRect(rectF5, 23.0f, 23.0f, paint4);
            m2020b(canvas, "上传", rectF5);
            paint4.setColor(Color.rgb(59, 130, 246));
            canvas.drawRoundRect(rectF6, 23.0f, 23.0f, paint4);
            m2020b(canvas, "下载", rectF6);
            paint4.setColor(Color.rgb(99, 102, 241));
            canvas.drawRoundRect(rectF7, 23.0f, 23.0f, paint4);
            m2020b(canvas, "双向", rectF7);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC3367j.m5100e(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                int rawX = (int) (this.f6722x - motionEvent.getRawX());
                int rawY = (int) (this.f6723y - motionEvent.getRawY());
                if (Math.abs(motionEvent.getRawX() - this.f6719u) > 10.0f || Math.abs(motionEvent.getRawY() - this.f6720v) > 10.0f) {
                    this.f6724z = true;
                }
                C0545k c0545k = this.f6709k;
                if (c0545k != null) {
                    c0545k.mo24c(this, Integer.valueOf(rawX), Integer.valueOf(rawY));
                }
                this.f6722x = motionEvent.getRawX();
                this.f6723y = motionEvent.getRawY();
                return true;
            }
            if (!this.f6724z) {
                if (System.currentTimeMillis() - this.f6721w > 650) {
                    C0833eb c0833eb = this.f6708j;
                    if (c0833eb != null) {
                        c0833eb.mo52a();
                        return true;
                    }
                } else if (this.f6717s) {
                    float x6 = motionEvent.getX();
                    float y7 = motionEvent.getY();
                    if (y7 >= getHeight() - 84.0f && y7 <= getHeight() - 14.0f) {
                        if (this.f6718t) {
                            C0833eb c0833eb2 = this.f6707i;
                            if (c0833eb2 != null) {
                                c0833eb2.mo52a();
                                return true;
                            }
                        } else {
                            float width = ((getWidth() - 56.0f) - 24.0f) / 3.0f;
                            float f7 = 28.0f + width;
                            float f8 = 12.0f + f7 + width;
                            if (x6 <= f7) {
                                C0833eb c0833eb3 = this.f6704f;
                                if (c0833eb3 != null) {
                                    c0833eb3.mo52a();
                                    return true;
                                }
                            } else if (x6 <= f8) {
                                C0833eb c0833eb4 = this.f6705g;
                                if (c0833eb4 != null) {
                                    c0833eb4.mo52a();
                                    return true;
                                }
                            } else {
                                C0833eb c0833eb5 = this.f6706h;
                                if (c0833eb5 != null) {
                                    c0833eb5.mo52a();
                                    return true;
                                }
                            }
                        }
                    } else {
                        C0833eb c0833eb6 = this.f6703e;
                        if (c0833eb6 != null) {
                            c0833eb6.mo52a();
                            return true;
                        }
                    }
                } else {
                    C0833eb c0833eb7 = this.f6703e;
                    if (c0833eb7 != null) {
                        c0833eb7.mo52a();
                    }
                }
            }
            return true;
        }
        this.f6719u = motionEvent.getRawX();
        this.f6720v = motionEvent.getRawY();
        this.f6721w = System.currentTimeMillis();
        this.f6722x = motionEvent.getRawX();
        this.f6723y = motionEvent.getRawY();
        this.f6724z = false;
        return true;
    }

    @Override // android.view.View
    public final boolean performLongClick() {
        return true;
    }
}
