/**
  * Created by tevyn on 17/10/16.
  */

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def size[A](t: Tree[A]): Int = t match {
  case l: Leaf[A] => 1
  case b: Branch[A] => size(b.left) + size(b.right) + 1
}